function submitForm() {
    const firstName = document.getElementById('firstName').value;
    const lastName = document.getElementById('lastName').value;
    const dob = document.getElementById('dob').value;
    const country = document.getElementById('country').value;
    const genderMale = document.getElementById('male').checked;
    const genderFemale = document.getElementById('female').checked;
    const gender = genderMale ? 'Male' : genderFemale ? 'Female' : 'Not specified';
    const profession = document.getElementById('profession').value;
    const email = document.getElementById('email').value;
    const mobile = document.getElementById('mobile').value;
  
    // Display the summary in the popup
    document.getElementById('summaryFirstName').innerText = firstName;
    document.getElementById('summaryLastName').innerText = lastName;
    document.getElementById('summaryDob').innerText = dob;
    document.getElementById('summaryCountry').innerText = country;
    document.getElementById('summaryGender').innerText = gender;
    document.getElementById('summaryProfession').innerText = profession;
    document.getElementById('summaryEmail').innerText = email;
    document.getElementById('summaryMobile').innerText = mobile;
  
    // Show the popup
    document.getElementById('popup').style.display = 'flex';
  }
  
  function resetForm() {
    document.getElementById('surveyForm').reset();
  }
  
  function closePopup() {
    // Hide the popup and reset the form
    document.getElementById('popup').style.display = 'none';
    resetForm();
  }
  