package com.infytraining.service;

import java.util.List;
import com.infytraining.dao.InfyTrainingDAO;
import com.infytraining.exception.InfyTrainingException;
import com.infytraining.model.Trainee;
import com.infytraining.model.TraineeReport;
import com.infytraining.validator.Validator;

public class InfyTrainingServiceImpl implements InfyTrainingService {
	
	private InfyTrainingDAO infyTrainingDAO;
	
	private Validator validator;
	
	@Override
	public String addTrainee(Trainee trainee) throws InfyTrainingException {
		// will implement this method
		return null;
	}

	@Override
	public String generateMailId(String traineeName){
		// will implement this method
		return null;
	}

	@Override
	public List<TraineeReport> generateTraineeReport(String idProof) throws InfyTrainingException{
		// will implement this method
		return null;
	}

}
