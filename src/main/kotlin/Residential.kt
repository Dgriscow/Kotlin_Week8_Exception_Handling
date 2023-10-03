
//class represents a Residential House
class Residential(var senior:Boolean, customerName:String, customerPhone:String, customerAddress:String, squareFootage:Double):Customer(customerName,customerPhone, customerAddress, squareFootage) {

    //static rate of residential buildings
    private val rate:Double = 6.0







    fun calcWeeklyRate(){

        //calculate the weekly rate for the Residential Buildings
        val units = squareFootage / 1000.0
        var weeklyCost = units * rate

        //determine if user gets a discount
        if (senior){
            //if user is a senior, apply the discount
            val discountAmount = 0.15
            weeklyCost -= discountAmount

            //since senior calculation is already done, print out the quote
            println("Hello Mr Or Mrs $customerName, Since Your Classified as Senior, Your Housing is discounted to $$weeklyCost\n" +
                    "Your House Located at $customerAddress is around $squareFootage ft in size\n" +
                    "Well call you with more information at: $customerPhone")
        }else{
            //if the user is NOT a senior, the property calculations are done
            println("Hello $customerName Your Houses Weekly Cost will be about  $$weeklyCost A Week\n" +
                    "Your House Located at $customerAddress, is around $squareFootage ft in size\n" +
                    "Well call you with more information at: $customerPhone")
        }





    }



}