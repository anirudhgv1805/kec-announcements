import React from "react";
import background from './assets/background.jpg'

export const HomePage : React.FC = () => {

    return(
        <>
          <div className="h-screen bg-cover bg-center" style={{ backgroundImage: 'url(./src/assets/background.jpg)' }}>
            <h1>This is the Homepage</h1>''
          </div>
        </>
    );
};