class DVDPlayer {
    
    boolean canRecord = false;
    
    void recordDVD() {
        System.out.println("идёт запись DVD");
    }

    public void playDVD() {
    }
}

class DVDPlayerTestDrive {
    public static void main(String[] args) {
        DVDPlayer d = new DVDPlayer();
        d.canRecord = true;
        d.playDVD();
        
        if (d.canRecord == true) {
            d.recordDVD();
        }
    }
}
