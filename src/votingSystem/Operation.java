package votingSystem;

public enum Operation {
	/**
	 * Enum representing the operation type of a client request or server response.
	 * _R is response
	 */
	ISELIGIBLE,
	ISELIGIBLE_R,
	WILLVOTE, 
	ISVOTING,
	ISVOTING_R, 
	GETIDENTIFICATION, 
	VOTE,
	VOTED, 
	VOTED_R,
	CHECKIDCOLLISION, 
	PROCESSVOTE,
	RESULTS,
	RESULTS_R,
	COUNTED,
	COUNTED_R,
	PROTEST,
	CHANGE,
	GETELECTIONSTATE,
	GETELECTIONSTATE_R,
	OTGETPUBLICKEYANDRANDOMMESSAGES,
	OTGETPUBLICKEYANDRANDOMMESSAGES_R,
	OTGETSECRETS,
	OTGETSECRETS_R,
	OTHER,
	STATE,
	STATE_R,
	SET_STATE //For simulation purposes, not usually called by the voter
}
