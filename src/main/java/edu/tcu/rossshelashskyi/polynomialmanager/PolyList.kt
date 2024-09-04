package edu.tcu.rossshelashskyi.polynomialmanager

//The PolyList class provides a data structure to store and
//manipulate polynomials. It consists of a mutable list of polynomials
//and functions for inserting, deleting, and searching for
//polynomials in the list
class PolyList{
    private val polyList: MutableList<Polynomial> = arrayListOf()

    /*
    Inserts a polynomial into the PolyList.
    Accepts a single Polynomial data type as argument.
    If a polynomial with the same name as the polynomial
    in the argument already exists in the PolyList,
    prints a message and returns 0.
    Otherwise, adds the Polynomial to the list and returns 1
     */
    fun insert(poly: Polynomial): Int{
        polyList.forEach{
            if(poly.name == it.name){
                println("POLYNOMIAL ${it.name} ALREADY INSERTED")
                return 0
            }
        }
        polyList.add(poly)
        polyPrint(poly)
        return 1
    }

    /*
    Deletes a Polynomial from PolyList.
    Accepts a single String representing a
    polynomial name as argument.
    If the PolyList contains a polynomial with name
    matching the argument, removes the polynomial
    from the PolyList, prints a success message
    and returns 1.
    Otherwise, prints and error message and returns 0.
     */
    fun delete(name: String): Int{
        polyList.forEach{
            if(name == it.name){
                polyList.remove(it)
                println("POLYNOMIAL $name SUCCESSFULLY DELETED")
                return 1
            }
        }
        println("POLYNOMIAL $name DOES NOT EXIST")
        return 0
    }

    /*
    Searches for a Polynomial in the PolyList and
    outputs it in a human-readable format.
    Accepts a single String representing the name
    of a Polynomial as an argument.
    If a Polynomial with name matching the argument
    exists in the PolyList, prints it using
    polyPrint function and returns 1.
    Otherwise, prints an error message and returns 0.
     */
    fun search(name: String): Int{
        polyList.forEach{
            if(name == it.name){
                polyPrint(it)
                return 1
            }
        }
        println("POLYNOMIAL $name DOES NOT EXIST")
        return 0
    }

    /*
    A private helper function for printing a
    Polynomial object into human readable format.
    Accepts a single object of Polynomial type as an argument.
     */
    private fun polyPrint(poly: Polynomial){
        val s: StringBuilder = StringBuilder()
        s.append("${poly.name} = ")
        //append each term to the string
        for (i in 0..<poly.getTermSize()) {
            val term = poly.getTermAt(i)
            //append coefficient
            if (term.coef < 0) {
                s.append(" - ${term.coef * -1}")
            } else {
                if (i != 0) {
                    s.append(" + ")
                }
                s.append(term.coef)
            }
            //append x
            if(term.a != 0){
                if(term.a == 1){
                    s.append("(x)")
                }else{
                    s.append("(x^${term.a})")
                }
            }
            //append y
            if(term.b != 0){
                if(term.b == 1){
                    s.append("(y)")
                }else{
                    s.append("(y^${term.b})")
                }
            }
            //append z
            if(term.c != 0){
                if(term.c == 1){
                    s.append("(z)")
                }else{
                    s.append("(z^${term.c})")
                }
            }
        }
        println(s)
    }
}