package org.test;

public class Task5 {
	
	@Then("The user should see the list of videos")
	public void the_user_should_see_the_list_of_videos(DataTable videoList) {
		List<String> videoListExpected = videoList.asList(String.class);

		ShapesAndAngles shapes = new ShapesAndAngles();
		List<WebElement> actualElements = shapes.getList_videoLnk();

		List<String> actualVideoList = new ArrayList<String>();

		for (WebElement actualElement : actualElements) {
			actualVideoList.add(actualElement.getText());

		}

		Assert.assertEquals(videoListExpected, actualVideoList);
	}

	@Then("The user should see the list parctice courses")
	public void the_user_should_see_the_list_parctice_courses(DataTable practiceList) {
		List<String> practiceListExpected = practiceList.asList(String.class);
		ShapesAndAngles shapes = new ShapesAndAngles();
		List<WebElement> actualElements = shapes.getList_practiceLnk();

		List<String> actualpracticeList = new ArrayList<String>();

		for (WebElement actualElement : actualElements) {
			actualpracticeList.add(actualElement.getText());

		}

		Assert.assertEquals(practiceListExpected, actualpracticeList);
	}

}
