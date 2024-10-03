package com.infytraining.test;

import java.time.LocalDate;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.infytraining.exception.InfyTrainingException;
import com.infytraining.model.Trainee;
import com.infytraining.service.InfyTrainingService;
import com.infytraining.service.InfyTrainingServiceImpl;

public class InfyTrainingServiceTest {

	private InfyTrainingService infyTrainingService= new InfyTrainingServiceImpl();

	@Test
	public void addTraineeInvalidDateOfJoiningTest() throws InfyTrainingException{
		Trainee trainee = new Trainee("John Paul", LocalDate.of(2024, 12, 31),
									  "passport", "john_paul", 9875412345L);
		InfyTrainingException exception = Assertions.assertThrows(InfyTrainingException.class,
																  () -> infyTrainingService.addTrainee(trainee));
		Assertions.assertEquals("Validator.INVALID_DATEOFJOINING", exception.getMessage());
	}
	
	@Test
	public void generateTraineeReportEmptyTraineeTest() throws InfyTrainingException {
		String idProof = "DrivingLicense";
		InfyTrainingException exception = Assertions.assertThrows(InfyTrainingException.class,
				  												  () -> infyTrainingService.generateTraineeReport(idProof));
		Assertions.assertEquals("TraineeService.EMPTY_TRAINEE", exception.getMessage());
	}

}
