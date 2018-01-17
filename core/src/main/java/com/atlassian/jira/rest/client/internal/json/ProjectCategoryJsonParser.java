package com.atlassian.jira.rest.client.internal.json;

import com.atlassian.jira.rest.client.api.domain.ProjectCategory;
import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;

import java.net.URI;

public class ProjectCategoryJsonParser implements JsonObjectParser<ProjectCategory> {

	@Override
	public ProjectCategory parse(JSONObject json) throws JSONException {
		final URI self = JsonParseUtil.getSelfUri(json);
		final Long id =  JsonParseUtil.getOptionalLong(json, "id");
		final String name = JsonParseUtil.getOptionalString(json, "name");
		final String description = JsonParseUtil.getOptionalString(json, "description");
		return new ProjectCategory(self, id, name, description);
	}
}
