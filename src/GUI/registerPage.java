package GUI;

import Database.InsertData;

public class registerPage {

    private String usertype;

    public registerPage(String type) {

        this.usertype = type;

        sendData();
    }

    public void sendData() {
        System.out.println("usertype is " + usertype);
        if (usertype.equals("Organizer")) {
            InsertData.insertAccount(true, "David", "Beckham", "david98@gmail.com", "beckhamsifre");
        } else {
            InsertData.insertAccount(false, "Donald", "Trump", "donaldTrmp@gmail.com", "sifredonald");
        }
    }
}
