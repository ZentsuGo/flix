package impl

trait Error

object Error {

  case class UnknownInterpretation(s: Symbol) extends RuntimeException(s"$s has no interpretation.")

  case class NonRelationalPredicate(p: Predicate) extends RuntimeException

  case class PredicateArityMismatch(p: Predicate, index: Int) extends RuntimeException

  case class UnboundVariable(v: Symbol) extends RuntimeException

  case class NonValueTerm(t: Term) extends RuntimeException

}
