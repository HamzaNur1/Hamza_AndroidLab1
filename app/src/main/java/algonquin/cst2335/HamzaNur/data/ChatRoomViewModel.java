package algonquin.cst2335.HamzaNur.data;


import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.ArrayList;
import algonquin.cst2335.HamzaNur.ChatRoom.ChatMessage;
public class ChatRoomViewModel extends ViewModel {
    public MutableLiveData<ArrayList<ChatMessage>> messages = new MutableLiveData<>();
}