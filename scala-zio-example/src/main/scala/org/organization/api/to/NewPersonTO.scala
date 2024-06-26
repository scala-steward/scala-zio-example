package org.organization.api.to

import java.time.Instant

import io.circe.generic.JsonCodec
import io.scalaland.chimney.dsl._
import org.organization.db.model.{Gender, NewPersonData}

@JsonCodec
final case class NewPersonTO(name: String, birthDate: Instant, gender: Gender) {
  def toDomain: NewPersonData =
    this.transformInto[NewPersonData]
}
