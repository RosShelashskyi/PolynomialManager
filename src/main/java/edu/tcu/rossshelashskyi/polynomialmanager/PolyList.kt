package edu.tcu.rossshelashskyi.polynomialmanager

class PolyList(val polyList: MutableList<Polynomial>) {

    fun insert(poly: Polynomial): Int{
        polyList.forEach{
            if(poly.name == it.name){
                println("POLYNOMIAL ${it.name} ALREADY INSERTED")
                return 0
            }
        }
        polyList.add(poly)
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
        return 1
    }

    fun search(name: String): Int{
        polyList.forEach{
            if(name == it.name){
                polyPrint()
                return 1
            }
        }
        println("POLYNOMIAL $name DOES NOT EXIST")
        return 0
    }

    private fun polyPrint(){

    }
}