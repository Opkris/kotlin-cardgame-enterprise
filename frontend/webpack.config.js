const path = require('path');

module.exports = {
    entity: './src/client/index.js',
    output: {
        filename: 'bundle.js',
        path: path.resolve(__dirname, 'public')
    },
    module: {
        rules: [
            {
                text: /\.jsx$/,
                exclude: /node_modules/,
                use: {
                    loader: "babel -loader"
                }
            }
        ]
    },
    resolve:{
        extensions: ['.js', '.jsx']
    },
    devServer: {
        contentBase: '/public'
    }
};