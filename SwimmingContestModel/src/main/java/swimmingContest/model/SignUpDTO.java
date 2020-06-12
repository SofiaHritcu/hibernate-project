package swimmingContest.model;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class SignUpDTO extends SignUp implements Serializable {
    List<SignUp> signUps=new ArrayList<>();
    List<Participant> participants=new ArrayList<>();
    List<SwimmingEvent> swimmingEvents=new ArrayList<>();

    public SignUpDTO() {
    }

    public SignUpDTO(Long participantId, Long swimmingEventId, List<SignUp> signUps, List<Participant> participants, List<SwimmingEvent> swimmingEvents) {
        super();
        super.setId(new Pair<>(participantId, swimmingEventId));
        this.signUps = signUps;
        this.participants = participants;
        this.swimmingEvents=swimmingEvents;
    }

    public Collection<? extends SignUp> getSignUps() {
        return signUps;
    }

    public void setSignUps(List<SignUp> signUps) {
        this.signUps = signUps;
    }

    public List<Participant> getParticipants() {
        return participants;
    }

    public void setParticipants(List<Participant> participants) {
        this.participants = participants;
    }

    public List<SwimmingEvent> getSwimmingEvents() {
        return swimmingEvents;
    }

    public void setSwimmingEvents(List<SwimmingEvent> swimmingEvents) {
        this.swimmingEvents = swimmingEvents;
    }

    @Override
    public String toString() {
        return this.getId().fst+" "+this.getId().snd+" "+this.getSignUps()+" "+this.getParticipants()+" "+this.getSwimmingEvents();

    }
}
