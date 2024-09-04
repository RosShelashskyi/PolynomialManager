package edu.tcu.rossshelashskyi.polynomialmanager

class Polynomial(val name: String){
    private val terms: MutableList<Term> = arrayListOf()

    fun addTerm(term: Term){
        terms.add(term)
    }
~
    fun getTermSize(): Int{
        return terms.size
    }

    fun getTermAt(index: Int): Term{
        return terms[index]
    }
}