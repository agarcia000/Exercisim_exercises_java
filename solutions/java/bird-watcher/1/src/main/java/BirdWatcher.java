
class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public static int[] getLastWeek() {
        int [] a ={0, 2, 5, 3, 7, 8, 4};
        for (int i=0 ; i<= 6;i++)  {
            System.out.println(a [i]);
            }; 
        return a;
    }

    public int getToday() {
         //int [] birdsPerDay = { 2, 5, 0, 7, 4, 1 };
        System.out.println(birdsPerDay [birdsPerDay.length-1]);
        return birdsPerDay[birdsPerDay.length-1]; 
    }

    public void incrementTodaysCount() {
        birdsPerDay[birdsPerDay.length-1]++; 
        System.out.println(birdsPerDay [birdsPerDay.length-1]);
        
    }

    public boolean hasDayWithoutBirds() {
        boolean decis = false;
        for(int i= 0; i < birdsPerDay.length; i++){
            
            if ( birdsPerDay[i]== 0){
                decis = true;
                break;
            }
            
            
                
         };
        return decis;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int suma = 0;
        if (numberOfDays > birdsPerDay.length){
                for (int i = 0; i < birdsPerDay.length; i++){
            
                    suma+= birdsPerDay [i];
            
        }
                
            }
        else{
            for (int i = 0; i < numberOfDays; i++){
            
            suma+= birdsPerDay [i];
            
        }
        }
        
        return suma;
    }

    public int getBusyDays() {
        int busy = 0 ;
        for (int i =0; i< birdsPerDay.length;i++ ){
            if (birdsPerDay[i]>=5){
                busy++;
            }
        }
        return busy;
    }
}
