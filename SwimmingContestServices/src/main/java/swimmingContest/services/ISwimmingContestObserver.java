package swimmingContest.services;

import swimmingContest.model.SignUpDTO;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ISwimmingContestObserver extends Remote {
    void addedSignUp(SignUpDTO signUpDTO) throws SwimmingContestException , RemoteException;
}
