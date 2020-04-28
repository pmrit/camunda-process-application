package com.example.workflow.delegate;

import java.util.Map;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class LoggerDelegate implements JavaDelegate {
	Logger log = LoggerFactory.getLogger(LoggerDelegate.class);

	@Override
	public void execute(DelegateExecution execution) throws Exception {
		String busKey = execution.getBusinessKey();
		Map<String, Object> map = execution.getVariables();
		String procDefId = execution.getProcessDefinitionId();
		log.info("procDefId="+procDefId);
		log.info("busKey="+busKey);
		log.info("variables="+map);

	}

}
