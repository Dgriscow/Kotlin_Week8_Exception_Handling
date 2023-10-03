
//class represents a commercial House
class Commercial (var propertyName:String, var multiProperty:Boolean,customerName:String, customerPhone:String, customerAddress:String, squareFootage:Double):Customer(customerName,customerPhone, customerAddress, squareFootage){

    //ititialized rate of commercial property
    private val rate:Double = 5.0






    //function does BOTH calculate the weekly rate AND prints out the FULL quote
    fun calcWeeklyRate(){
        //Begin calculating the weekly cost from the math
        val units = squareFootage / 1000.0
        var weeklyCost = units * rate

        //determine discount for multi Properties
        if (multiProperty){
            //if the user has multiple properties, apply the discount
            val discountAmount = 0.1 * weeklyCost
            weeklyCost -= discountAmount
        }

        //Now Print Out the Quote
        println("Well $customerName Your Weekly Cost will be $$weeklyCost.\nYour House $propertyName is around $squareFootage Square Feet in size\nYour House Is Located At $customerAddress\nWe'll Call You At $customerPhone")

    }


}

