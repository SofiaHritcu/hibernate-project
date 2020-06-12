package swimmingContest.persistence;

import swimmingContest.model.SwimmingEvent;
import swimmingContest.model.SwimmingStroke;

public interface SwimmingEventInterface extends CrudRepository<Long, SwimmingEvent>{
    SwimmingEvent findSwimmingEventByStyleDistance(SwimmingStroke swimmingStroke, Integer distance);
}
