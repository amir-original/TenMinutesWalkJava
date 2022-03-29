public class TenMinutesWalk {
    private int time;

    public TenMinutesWalk(int time){
        this.time = time;
    }
    public boolean isValid(char[] walk) {
        int midway = walk.length / 2;
        int minute = 0;
        for (int index = 0; index < midway; index++){
            if (ayaDarRastaye_Y_MasirRaftVaBargashtSahihAst(walk[index], walk[index + midway])){
                minute += 2;
            }else if (ayaDarRastaye_X_MasirRaftVaBargashtSahihAst(walk[index], walk[index + midway])){
                minute += 2;
            }
        }
        return minute == time;
    }


    private boolean ayaDarRastaye_Y_MasirRaftVaBargashtSahihAst(char walkDirection, char midwayDirection) {
        boolean result = false;
        if(walkDirection == 'n' && midwayDirection == 's'){
            result = true;
        }else if (walkDirection == 's' && midwayDirection== 'n'){
            result = true;
        }
        return result;
    }

    private boolean ayaDarRastaye_X_MasirRaftVaBargashtSahihAst(char walkDirection, char midwayDirection) {
        boolean result = false;
        if(walkDirection == 'w' && midwayDirection == 'e'){
            result = true;
        }else if (walkDirection == 'e' && midwayDirection== 'w'){
            result = true;
        }
        return result;
    }

}
