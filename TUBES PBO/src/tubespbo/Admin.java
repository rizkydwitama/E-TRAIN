package tubespbo;

import java.util.ArrayList;

public class Admin {
    private int idAdmin;
    private User dataUser;
    private Tiket dataTiket;
    private ArrayList<Tiket> userTiket = new ArrayList<>();

    public User getDataUser(){
        return dataUser;
    }

    public Tiket getDataTiket(){
        return dataTiket;
    }
}
