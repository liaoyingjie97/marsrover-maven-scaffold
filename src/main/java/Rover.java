public class Rover {
    int x;
    int y;
    char towards;
    Area area;


    public Rover() {

    }

    public void land(Area area, int x, int y, char towards) {
        this.area = area;
        if(x<area.x){
            this.x = x;
        }else {
            this.x = -1;
        }
        if(y<area.y){
            this.y = y;
        }else{
            this.y = -1;
        }
        this.towards = towards;
    }

    public String getPosition(){
        String str = "";
        return null;
    }





}
