public class RoverController {

    Rover rover;
    String mission = null;

    int x;
    int y;
    char towards;
    Area area = new Area();

    public RoverController(Rover rover) {
        this.rover = rover;
    }

    public String excute(String mission) {
        String[] missionList = mission.split(",");
        try{
            x = Integer.parseInt(missionList[2]);
        }catch (NumberFormatException e){
            rover.setDestory(true);
            x=-1;
        }
        try{
            y = Integer.parseInt(missionList[3]);
        }catch (NumberFormatException e){
            rover.setDestory(true);
            y=-1;
        }
        try{
            area.setX(Integer.parseInt(missionList[0]));
        }catch (NumberFormatException e){
            rover.setDestory(true);
            area.setX(-1);
        }
        try{
            area.setY(Integer.parseInt(missionList[1]));
        }catch (NumberFormatException e){
            rover.setDestory(true);
            area.setY(-1);
        }
        towards = missionList[4].charAt(0);
        rover.land(area,x,y,towards);

        for(int i = 5;i < missionList.length;i++){
            String missionItem = missionList[i];
            if(missionItem.equals("L") || missionItem.equals("l")){
                rover.rotationL();
            }else if(missionItem.equals("R")|| missionItem.equals("r")){
                rover.rotationR();
            }else if(missionItem.equals("M")|| missionItem.equals("m")){
                rover.move();
            }else {
                try{
                    int distant = Integer.parseInt(missionItem);
                    rover.move(distant);
                }catch (NumberFormatException e){
                    rover.setDestory(true);
                }
            }
        }
        return rover.getPosition();
    }
}
