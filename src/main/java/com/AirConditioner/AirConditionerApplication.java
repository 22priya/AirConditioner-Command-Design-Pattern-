package com.AirConditioner;

import com.Command.Command;
import com.Command.TurnOffACCommand;
import com.Command.TurnOnACCommand;
import com.Command.UpdateTemperatureCommand;
import com.Remote.Remote;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AirConditionerApplication {

	public static void main(String[] args) {
		SpringApplication.run(AirConditionerApplication.class, args);

		Remote remote=new Remote();
		AirConditioner ac=new AirConditioner();

		Command turnOnACCmd=new TurnOnACCommand(ac);
		Command turnOffACCmd=new TurnOffACCommand(ac);
		Command setTemperatureCmd=new UpdateTemperatureCommand(ac,25);

		remote.setCommand(turnOnACCmd);
		remote.pressButton();

		remote.setCommand(turnOffACCmd);
		remote.pressButton();

		remote.undo();
		remote.setCommand(setTemperatureCmd);
		remote.pressButton();

		remote.setCommand(new UpdateTemperatureCommand(ac,40));
		remote.pressButton();
		remote.undo();
	}



}
