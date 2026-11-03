public class Lasagna {
    
    // TODO: define the 'expectedMinutesInOven()' method
    public int expectedMinutesInOven(){
        int minutes = 40;
        return minutes;
    }

    // TODO: define the 'remainingMinutesInOven()' method
    public int remainingMinutesInOven(int num){
        
        int remain = expectedMinutesInOven()-num;
        return remain;
    }
    // TODO: define the 'preparationTimeInMinutes()' method
    public int preparationTimeInMinutes(int value){    
        int prep = value*2;
        return prep;

    }
    public int totalTimeInMinutes(int layers, int t){
        //return minutes total that work on lasagna 
        int total = (layers*2)+t;
        return total;  
    }
        
        
    }

    // TODO: define the 'totalTimeInMinutes()' method
