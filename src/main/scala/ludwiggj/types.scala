package ludwiggj

import io.estatico.newtype.macros.newtype

object types {
  @newtype case class WidgetId(toInt: Int)

  @newtype case class ActorName(value: String)

  @newtype case class DirectorId(id: Int)

  @newtype case class DirectorName(name: String)

  @newtype case class DirectorLastName(lastName: String)
}

