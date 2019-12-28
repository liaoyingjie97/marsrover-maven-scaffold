public class Rover {
    int x;
    int y;
    char towards;
    Area area;
    boolean isDestory = false;


    public Rover() {
    }
    public void setDestory(boolean destory) {
        isDestory = destory;
    }


    public void land(Area area, int x, int y, char towards) {
        this.area = area;
        if (x < area.x && x>0) {
            this.x = x;
        } else {
            this.isDestory = true;
        }
        if (y < area.y && y > 0) {
            this.y = y;
        } else {
            this.isDestory = true;
        }
        this.towards = towards;
    }

    public String getPosition() {
        String str;
        if(!isDestory){
            str = ""+x+y+towards;
        }else{
            str = "错误的指令";
        }
        return str;
    }


    public void move(int distant) {
        if (towards == 'N') {
            y += distant;
            if(y > area.y){
                isDestory = true;
            }
        }
        if (towards == 'S') {
            y -= distant;
            if(y < 0){
                isDestory = true;
            }
        }
        if (towards == 'E') {
            x += distant;
            if(x > area.x){
                isDestory = true;
            }
        }
        if (towards == 'W') {
            x -= distant;
            if(x < 0){
                isDestory = true;
            }
        }
    }

    public void move(){
        this.move(1);
    }

    public void rotationL() {
        if(towards=='N'){
            towards='W';
        }else if(towards=='E'){
            towards='N';
        }else if(towards=='S'){
            towards='E';
        }else if(towards=='W'){
            towards='S';
        }
    }

    public void rotationR() {
        if(towards=='N'){
            towards='E';
        }else if(towards=='E'){
            towards='S';
        }else if(towards=='S'){
            towards='W';
        }else if(towards=='W'){
            towards='N';
        }
    }

}
