$<%--
  Copyright 1997-2008 Day Management AG
  Barfuesserplatz 6, 4001 Basel, Switzerland
  All Rights Reserved.

  This software is the confidential and proprietary information of
  Day Management AG, ("Confidential Information"). You shall not
  disclose such Confidential Information and shall use it only in
  accordance with the terms of the license agreement you entered into
  with Day.

  ==============================================================================

  List component sub-script

  Draws a list item as a teaser.

  request attributes:
  - {com.day.cq.wcm.foundation.List} list The list
  - {com.day.cq.wcm.api.Page} listitem The list item as a page

--%><%
%><%@ page session="false"
           import="com.day.cq.wcm.api.Page,
                   javax.jcr.Node,
                   javax.jcr.RepositoryException,
                   org.apache.commons.lang3.StringEscapeUtils"%><%

    Page listItem = (Page)request.getAttribute("listitem");

    boolean hasImage = false;
    String title = listItem.getTitle() != null ? listItem.getTitle() : listItem.getName();
    String description = listItem.getDescription() != null ? listItem.getDescription() : "";

    try {
        hasImage = listItem.getContentResource().adaptTo(Node.class).hasNode("image") ||
                listItem.getProperties().get("imageReference", "").length() > 0;
    } catch (RepositoryException re) {
    }

    %><li><p><a href="<%= listItem.getPath() %>.html" title="<%= StringEscapeUtils.escapeHtml4(title) %>"
                onclick="CQ_Analytics.record({event: 'listTeaserItemClicked', values: { listItemPath: '<%= listItem.getPath() %>' }, collect:  false, options: { obj: this }})"><%

    if (hasImage) {
        %><img class="teaser" src="<%= listItem.getPath() %>/jcr:content.thumbnail.48.48.jpg" alt="<%= StringEscapeUtils.escapeHtml4(title) %>" title="<%= StringEscapeUtils.escapeHtml4(title) %>"><%
    }

    %><span class="teaser-title"><%= StringEscapeUtils.escapeHtml4(title) %></span></a><%

    if (!"".equals(description)) {
        %><br/><span class="teaser-description"><%= StringEscapeUtils.escapeHtml4(description) %></span><%
    }

%></p></li>