Fragment Account-AlterAccountTest { 
   Action: add
   Priority: medium
   FragmentationPoints: @TestAccount
   PointBracketsLan: java
   Destinations: Account-AccountTest
   SourceCode: [ALTERCODE-FRAG]@Test
	public void servlet_going_To_Home() throws IOException, ServletException {
		HttpServletRequest request = mock(HttpServletRequest.class);
		HttpServletResponse response = mock(HttpServletResponse.class);
		HttpSession session = mock(HttpSession.class);

		when(request.getSession()).thenReturn(session);
		myServlet.doGet(request, response);
		verify(response).sendRedirect("../Home");
	}[/ALTERCODE-FRAG]
}