/**
 * I declare that this code was written by me.
 * I will not copy or allow others to copy my code.
 * I understand that copying code is considered as plagiarism.
 *
 * {21037847 Sansalian John}, {7/7/2022} {09.15}
 */

/**
 * @author 21037847
 *
 */
public class userAccount {
	private int studentId;
	private String username;

	public userAccount(int studentId, String username) {
		//
		this.studentId = studentId;
		this.username = username;
	}

	/**
	 * @return the studentId
	 */
	public int getStudentId() {
		return studentId;
	}

	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}

}
