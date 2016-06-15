package arithmeticPractice.sort;

public  class Out{
    private String outName;
   class Inner{
        private String innerName;
        public void printOutName(){
        }
    }  
   
    
    public void printTest(final String name){
    	final String test = "test";
    	class Print{
    		public Print(){
    			System.out.println(test);
    		}
    	}
    	new Print();
    }
    public  void testOut(arithmeticPractice.sort.Inner inner){
    	
    };
}