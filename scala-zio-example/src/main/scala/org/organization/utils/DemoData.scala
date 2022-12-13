package org.organization.utils

import org.organization.AppEnv.AppIO
import org.organization.db.model.{Gender, PersonEnt}
import org.organization.db.repository.PersonRepository

import java.time.Instant
import java.util.UUID

object DemoData extends PersonRepository {

  private def rUUID = UUID.randomUUID()

  val fillDb: AppIO[Unit] =
    for {
      _ <- insert(PersonEnt(0, rUUID, "PersonName 1", Instant.parse("2007-12-03T10:15:30.00Z"), Gender.Male))
      _ <- insert(PersonEnt(0, rUUID, "PersonName 2", Instant.parse("1984-01-02T10:10:50.00Z"), Gender.Female))
    } yield ()
}
