package com.fordays.fdpay.transaction;


import com.fordays.fdpay.transaction._entity._ExpenseLog;

public class ExpenseLog extends _ExpenseLog{
  	private static final long serialVersionUID = 1L;
  	protected com.fordays.fdpay.agent.Agent fromAgent;
	public com.fordays.fdpay.agent.Agent getFromAgent() {
		return fromAgent;
	}
	public void setFromAgent(com.fordays.fdpay.agent.Agent fromAgent) {
		this.fromAgent = fromAgent;
	}

}
