package edu.tcu.rossshelashskyi.polynomialmanager;

fun main(){
    while(true){
        val command = readlnOrNull()

        val args: List<String>? = command?.split(" ")

        val polyList = PolyList()
        if (args != null) {
            //check which command is entered
            if(args[0] == "INSERT"){
                //set up the polynomial object
                val polynomial = Polynomial(args[1])
                //iterate over the terms in the input
                var i = 2
                while(i < args.size){
                    //split term into integers
                    val termStr: List<String> = args[i].split(",")
                    //create a term object with coefficient and exponents from the input string
                    val term = Term(termStr[0].toInt(), termStr[1].toInt(), termStr[2].toInt(), termStr[3].toInt())
                    //add term to the polynomial
                    polynomial.addTerm(term)
                    i++
                }
                //add the polynomial to polyList
                polyList.insert(polynomial)
            }else if(args[0] == "DELETE"){
                //delete polynomial with name in the input
                polyList.delete(args[1])
            }else if(args[0] == "SEARCH"){
                polyList.search(args[1])
            }else if(args[0] == "QUIT") {
                return
            }
            else{
                println("INCORRECT INPUT. ACCEPTABLE COMMANDS:\nINSERT\nDELETE\nSEARCH\nQUIT")
            }
        }
    }
}