package edu.tcu.rossshelashskyi.polynomialmanager;

class PolyManager {
    fun main(){
        while(true){
            val command = readlnOrNull()

            val args: List<String>? = command?.split(" ")

            if (args != null) {
                if(args[0] == "INSERT"){

                }else if(args[0] == "DELETE"){

                }else if(args[0] == "SEARCH"){

                }else if(args[0] == "QUIT") {
                    return
                }
            }
        }
    }
}
