package com.atlassian.jira.rest.client.api.domain;

import com.atlassian.jira.rest.client.api.AddressableEntity;
import com.atlassian.jira.rest.client.api.NamedEntity;
import com.google.common.base.Objects;

import javax.annotation.Nullable;
import java.net.URI;

/**
 * Class purpose :
 */

public class ProjectCategory implements AddressableEntity, NamedEntity {

	private final URI self;
	@Nullable
	private final Long id;
	@Nullable
	private final String name;
	@Nullable
	private final String description;

	public ProjectCategory(URI self, Long id, String name, String description) {
		this.self = self;
		this.id = id;
		this.name = name;
		this.description = description;
	}

	@Override
	public URI getSelf() {
		return self;
	}

	@Nullable
	public Long getId() {
		return id;
	}

	@Override
	@Nullable
	public String getName() {
		return name;
	}

	@Nullable
	public String getDescription() {
		return description;
	}

	@Override
	public String toString() {
		return getToStringHelper().toString();
	}

	protected Objects.ToStringHelper getToStringHelper() {
		return Objects.toStringHelper(this).
				add("self", self).
				add("id", id).
				add("name", name).
				add("description", description);
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof ProjectCategory) {
			ProjectCategory that = (ProjectCategory) obj;
			return Objects.equal(this.self, that.self)
					&& Objects.equal(this.name, that.name)
					&& Objects.equal(this.id, that.id)
					&& Objects.equal(this.description, that.description);
		}
		return false;
	}

	@Override
	public int hashCode() {
		return Objects.hashCode(self, name, id, description);
	}

}
