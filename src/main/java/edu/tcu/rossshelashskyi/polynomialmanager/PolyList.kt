package edu.tcu.rossshelashskyi.polynomialmanager

class PolyList{
    private val polyList: MutableList<Polynomial> = arrayListOf()

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

    private fun polyPrint(poly: Polynomial){
        val s: StringBuilder = StringBuilder()
        s.append("${poly.name} = ")
        //append each term to the string
        for (i in 0..<poly.getTermSize()) {
            val term = poly.getTermAt(i)
            //append coefficient
            if (term.coef < 0) {
                s.append(term.coef)
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