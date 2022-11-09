public class HarrysWork {
    public static void main(String[] args){
        System.out.println("LList object created for storing houses.");
        LList<House> hList = new LList<House>();
        System.out.println("The contents of the list is: "+ hList);
        
        try{
            House h;
            for(int i= 0;i<10;i++){
            h = new House (i+1900);
            hList.add(h);
            }
            System.out.println("The new contents of the list is: "+hList);
        }catch(ListException e){

        }
    }
}
