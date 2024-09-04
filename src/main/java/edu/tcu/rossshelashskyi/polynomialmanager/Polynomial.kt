package edu.tcu.rossshelashskyi.polynomialmanager

//The Polynomial class stores a single polynomial
//with its name and a mutable list of terms.
//Constructor takes the name of the polynomial as argument.
//The list of terms is private with all the necessary
//methods encapsulated in the class methods
class Polynomial(val name: String){
    private val terms: MutableList<Term> = arrayListOf()

    fun addTerm(term: Term){
        terms.add(term)
    }

    fun getTermSize(): Int{
        return terms.size
    }

    fun getTermAt(index: Int): Term{
        return terms[index]
    }
}