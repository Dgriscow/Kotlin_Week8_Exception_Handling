class MainCalls {
    fun presentMenu(){
        //user enters `0` to leave
        var userInput:Int = 0

        //Use a do while loop to present user choices
        do {
            //print The choices
            print("What Kind Of Housing would you Like To Get A Quote For?\n1:Commercial\n2:Residential\nEnter Your Choice(0 to leave): ")


            userInput = try {
                readln().toInt()
            }catch (e:Exception){
                println("Error: $e")
                117
            }

            //depending on the users input, call a function that gets the input for the choice
            when(userInput){
                1 -> choseCommercial()
                2 -> choseResidential()
                else -> println("Invalid Choice")

            }

        }while (userInput != 0)





    }


    //The Following Functions Purposes are to take in,
    // convert and handle the users values for a house of their choosing type
    fun choseCommercial(){

        println("Whats The Name Of The Property?")
        val propertyName:String = readln().toString()

        println("Do You Own Multiple Houses? (0 no, 1 yes)")
        var multiProperty:Int = 0

        multiProperty = try{
            readln().toInt()

        } catch (e:Exception){
            println("Program Ran Into An Error: $e")
            0 //if the program encounters an error(like user putting in a 'f', just have the default go to 0)

        }


        val multiBool:Boolean = when(multiProperty){
            1 -> true
            0 -> false
            else -> false //If they enter something invalid, default is no multi property
        }
        //standard Customer Questions
        println("Whats Your Name?: ")
        val name:String = readln()

        println("Whats Your Phone Number?: ")
        val number:String = readln()

        println("Whats Your Address?: ")
        val address:String = readln()

        println("Whats Your Houses Square Footage?: ")
        val footage:Double = try {
            readln().toDouble()
        }catch (e:NumberFormatException){
            println("Error: $e")
            //Default value in case a error occurs
            20000.0

        }

        //with all the revelant Data, send it all to Commercial
        var comm = Commercial(propertyName, multiBool, name, number, address, footage)
        comm.calcWeeklyRate()

    }

    fun choseResidential(){
        println("Are You A Senior Citizen? (0 no, 1 yes): ")

        val seniorInt:Int = try {
            readln().toInt()
        }catch (e:NumberFormatException){
            println("Error When Reading Citizen Type $e")
            0 //default will be not old man
        }

        val seniorAval:Boolean = when(seniorInt){
            1 -> true
            0 -> false
            else -> false //If they enter something invalid, default is not Senior
        }

        //standard Customer Questions
        println("Whats Your Name?: ")
        val name:String = readln()

        println("Whats Your Phone Number?: ")
        val number:String = readln()

        println("Whats Your Address?: ")
        val address:String = readln()

        println("Whats Your Houses Square Footage?: ")
        val footage:Double = try {
            readln().toDouble()
        }catch (e:NumberFormatException){
            println("Error Occured When getting Square Footage: $e")
            //set the defauly square footage to 10,000
            10000.0
        }

        //with all the revelant Data, send it all to Residential
        val res = Residential(seniorAval,name, number,address,footage)
        res.calcWeeklyRate()



    }

}