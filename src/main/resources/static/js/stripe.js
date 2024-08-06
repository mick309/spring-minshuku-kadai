<<<<<<< HEAD
const stripe = Stripe('pk_test_51MwfEuAAEPgBtL4yo6bxzh8EaMy8VWkUXeNYYS3e23eQ6ReO4LSZabuGqH5MI9bEne0lXNjHn5HRu5pISVDAhaXt008vq0knOw');
const paymentButton = document.querySelector('#paymentButton');

paymentButton.addEventListener('click', () => {
  stripe.redirectToCheckout({
    sessionId: sessionId
  })
});
=======
const stripe = Stripe('pk_test_51PfM1lK56XZ4pCuCNrhhlmbG0uqByy8fghmPpxVtcRUGDRg75tXsRg4xKmWxmIzPTWtELzafgXcsVTpp6NhlQGEn00SRbWupfD');
const paymentButton = document.querySelector('#paymentButton');

paymentButton.addEventListener('click', () => {
	stripe.redirectToCheckout({
		sessionId: sessionId
	})
});
>>>>>>> branch 'main' of https://github.com/mick309/spring-minshuku-kadai.git
