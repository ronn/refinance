
    // display text in the output area
    const showOutput = (text) => {
        document.getElementById("output").innerHTML = text;
    };

    // load and display JSON sent by server for /players

    const getData = async () => {
        try{
            //await the response of the fetch call
            const response = await fetch("/api/debtors", {
                method: "GET",
                dataType: 'json',
            });
            const data = await response.json();
            console.log(response);
            showOutput(JSON.stringify(data, null, 2));
        } catch (error) {
            showOutput( "Failed: " + error );
        }

    };



    // handler for when user clicks add person

    const addPlayer = () => {
        const user = document.getElementById("user").value;
        console.log(user);
        if (user.length) {
            postData (user);
        }
    };

    // code to post a new player using AJAX
    // on success, reload and display the updated data from the server

    const postData = async (userName) => {
        try{
            //await the response of the fetch call
           const data = await (await fetch("/rest/players", {
                headers: {
                    "Content-Type": "application/json"
                },
                method: "POST",
                dataType: "json",
                body: { "userName": userName }
            })).json();
            console.log(data);
            showOutput("Saved -- reloading");
            console.log("reloading");
            getData();
        } catch (error) {
            showOutput( "Failed: " + error );
            console.log("error: " + error);
        }
    };

    getData();

