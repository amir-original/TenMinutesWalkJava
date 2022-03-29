public class TenMinutesWalk {
    private int time;

    public TenMinutesWalk(int time){
        this.time = time;
    }

    public boolean isValid(char[] walk) {
        int midway = walk.length / 2;
        int minute = 0;
        int zamanRaftBargasht = 2;
        for (int index = 0; index < midway; index++){
            int masireRaft = midway - index - 1;
            int masireBargasht = midway + index;

            if (ayaMasireRaftVaBargashtYekiAst(walk[masireRaft], walk[masireBargasht])){
                minute += zamanRaftBargasht;
            }
        }
        return minute == time;
    }



    private boolean ayaMasireRaftVaBargashtYekiAst(char jahateRaft, char jahateBargasht) {
        boolean result = false;

        if(ayaJahatRaftNorthVaJahatBargashtSouthAst(jahateRaft, jahateBargasht)){
            result = true;
        }
        else if (ayaJahatRaftSouthVaJahtBargashtNorthAst(jahateRaft, jahateBargasht)){
            result = true;
        }
        else if(ayaJahatRaftWestVaJahatBargashtEstAst(jahateRaft, jahateBargasht)){
            result = true;
        }
        else if (ayaJahatRaftEstVaJahatBargashtWestAst(jahateRaft, jahateBargasht)){
            result = true;
        }
        return result;
    }

    private boolean ayaJahatRaftEstVaJahatBargashtWestAst(char jahateRaft, char jahateBargasht) {
        return jahateRaft == 'e' && jahateBargasht== 'w';
    }

    private boolean ayaJahatRaftWestVaJahatBargashtEstAst(char jahateRaft, char jahateBargasht) {
        return jahateRaft == 'w' && jahateBargasht == 'e';
    }

    private boolean ayaJahatRaftSouthVaJahtBargashtNorthAst(char jahateRaft, char jahateBargasht) {
        return jahateRaft == 's' && jahateBargasht== 'n';
    }

    private boolean ayaJahatRaftNorthVaJahatBargashtSouthAst(char jahateRaft, char jahateBargasht) {
        return jahateRaft == 'n' && jahateBargasht == 's';
    }
}
