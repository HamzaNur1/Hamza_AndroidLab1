package algonquin.cst2335.HamzaNur.data;

public class ChatMessage {
    String message;
    String timeSent;
    boolean isSentButton;

    ChatMessage(String m, String t, boolean sent)
    {
        message = m;
        timeSent = t;
        isSentButton = sent;
    }

}
