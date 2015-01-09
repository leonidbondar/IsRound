public class IsRound {
	public static boolean isRound(String inputParam) {
		boolean flag = true;
		try {
			Integer tmpInteger = Integer.parseInt(inputParam);
		} catch (NumberFormatException e) {
			flag = false;
			e.printStackTrace();
		}
		System.out.println(flag);

		return flag;
	}
}
