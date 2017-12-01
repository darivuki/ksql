/**
 * Copyright 2017 Confluent Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 **/

package io.confluent.ksql.parser.tree;

import java.util.Objects;
import java.util.Optional;

import io.confluent.ksql.query.QueryId;

import static com.google.common.base.MoreObjects.toStringHelper;

public class TerminateQuery extends Statement {

  private final QueryId queryId;

  public TerminateQuery(String queryId) {
    this(Optional.empty(), queryId);
  }

  public TerminateQuery(NodeLocation location, String queryId) {
    this(Optional.of(location), queryId);
  }

  private TerminateQuery(Optional<NodeLocation> location, String queryId) {
    super(location);
    this.queryId = new QueryId(queryId);
  }

  public QueryId getQueryId() {
    return queryId;
  }

  @Override
  public int hashCode() {
    return Objects.hash("TerminateQuery");
  }

  @Override
  public boolean equals(Object obj) {
    return this == obj;
  }

  @Override
  public String toString() {
    return toStringHelper(this)
        .toString();
  }
}
