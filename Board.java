public class Board {
    private Field[] fields;

    public Board(){
        fields = new Field[40];
        for(int i = 0; i < 40; i++){
            fields[i] = new Field("Field" + (i + 1), (i + 1));
        }
    }

    public Field[] getFields() {
        return fields;
    }
}
