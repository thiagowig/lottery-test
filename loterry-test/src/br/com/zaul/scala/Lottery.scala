package br.com.zaul.scala
import scala.collection.mutable.HashSet

/**
 * 
 */
object Lottery {

	/** */
	val cards = new HashSet[CardTrait]

	/**
	 * 
	 */
	def main(args: Array[String]) {
		createCards()
		
		cards.foreach(each => {
			println(each.numbers)
		})
	}
	
	def createCards() {
	  cards.+(createCard(HashSet{6; 8; 10; 17;29; 32; 40; 45; 47; 52}))
	  cards.+(createCard(HashSet{7; 9; 11; 13; 15; 17; 20; 27; 33; 48}))
	}
	
	def createCard(numbers: HashSet[Integer]) : CardTrait = {
	  val card = Card
	  
	  card.numbers = numbers
	  println(numbers)
	  card
	}

	/**
	 * 
	 */
	def doSomething(value: String) : String = {
			value + "Fonseca" 
	}
}