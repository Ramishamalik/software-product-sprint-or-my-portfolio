// Copyright 2020 Google LLC
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     https://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

/**
 * Adds a random greeting to the page.
 */
function addRandomGreeting() {
  const greetings =
      ['"I wish there was a way to know you are in the good old days before you have actually left them." – Andy Bernard, The Office', '“If you look for the light you will often find it. But if you look for the dark, it is all you will ever see.” – Iroh, The Legend of Korra', '“Worrying means you suffer twice.”—Fantastic Beasts', '“Believe in yourselves. Dream. Try. Do good.”—Boy Meets World'];

  // Pick a random greeting.
  const greeting = greetings[Math.floor(Math.random() * greetings.length)];

  // Add it to the page.
  const greetingContainer = document.getElementById('greeting-container');
  greetingContainer.innerText = greeting;
}

/** Fetches the current date from the server and adds it to the page. */
async function showServerExperience() {
  const responseFromServer = await fetch('/fetch');
  const textFromResponse = await responseFromServer.text();

  const myExperience = document.getElementById('my-experience');
  myExperience.innerText = textFromResponse;
}

function requestTranslation() {
    const text = document.getElementById('text').value;
    const languageCode = document.getElementById('language').value;

    const resultContainer = document.getElementById('result');
    resultContainer.innerText = 'Loading...';

    const params = new URLSearchParams();
    params.append('text', text);
    params.append('languageCode', languageCode);

    fetch('/translate', {
        method: 'POST',
        body: params
    }).then(response => response.text())
    .then((translatedMessage) => {
        resultContainer.innerText = translatedMessage;
    });
    }

//Funtion not working
/** 
async function getFactsServlet(){
    // Send a request to /randomFunFacts.
    const responseFromServer = await fetch('/randomFunFacts');
    const randomFunFacts = await responseFromServer.json();

    const randomFunFacts = document.getElementById('facts-container');
    randomFunFacts.innerHTML = '';

    console.log(randomFunFacts);}



*/