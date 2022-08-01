package tutorial_04{

object tute_04
{

	//1
    def interest(M:Double):Double= M match {
    	case x if x<20000 => x*2/100
    	case x if x<200000 => x*4/100
    	case x if x<2000000 => x*3.5/100
    	case x if x>200000 => x*6.5/100
    }

    //2
    def PatternMatching(num:Int):String = num match{
    	case n if n<0 => "Negative"
    	case n if n==0 => "Zero"
    	case n if n%2==0 => "Even"
    	case _ => "Odd" 	
    }

	//3
	def toUpper(txt:String):String = txt.toUpperCase()
	def toLower(txt:String):String = txt.toLowerCase()


	def formatNames(name:String)(index_list:Int*)(function:String => String):String={
		if(index_list.isEmpty)
		{
			return function(name)
		}
		var temp

		var i

		for(i=0;i<name.length()){
			if(index_list.contains(i)
			{
				 temp = temp+ function(name.charAt(i).toString)
		    }
            else
			{
				temp = temp + name.charAt(i)toString
			}
			temp
		}
	}


	def main(args:Array[String]) Unit = {

		println(formatNames("Benny")()(toUpper))
		println(formatNames("Niroshan")(0,1)(toUpper))
		println(formatNames("Saman")()(toLower))
		println(formatNames("Kumara")(5)(toUpper))

                                  
	}
	
}	


}