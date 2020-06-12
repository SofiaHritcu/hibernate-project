package swimmingContest.model;

import java.io.Serializable;

public class SwimmingEventDTO extends SwimmingEvent implements Serializable {
    private Integer numberOfParticipants;

    public SwimmingEventDTO(SwimmingStroke swimmingStroke, Integer distance, Integer numberOfParticipants) {
        super(swimmingStroke, distance);
        this.numberOfParticipants = numberOfParticipants;
    }

    public Integer getNumberOfParticipants() {
        return numberOfParticipants;
    }

    public void setNumberOfParticipants(Integer numberOfParticipants) {
        this.numberOfParticipants = numberOfParticipants;
    }

    @Override
    public String toString() {
        return super.toString()+" "+this.getNumberOfParticipants();
    }
}
